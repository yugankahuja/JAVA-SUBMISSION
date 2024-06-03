package com.ey.ui;

import com.ey.exception.OperatorException;
import com.ey.model.Activity;

public class Source {

    public static void main(String[] args) {
        Activity activity = new Activity("Hello", "Welcome", "+");
        Source source = new Source();
        try {
            if (!source.validate(activity)) {
                throw new OperatorException("Invalid parameters");
            }

            String result = source.doOperation(activity);
            System.out.println(result);

        } catch (OperatorException e) {
            e.printStackTrace();
        }
    }

    public boolean validate(Activity activity) throws OperatorException {
        if (activity.getString1() == null || activity.getString2() == null || activity.getOperator() == null) {
            throw new NullPointerException("One or more parameters are null");
        }

        if (!activity.getOperator().equals("+") && !activity.getOperator().equals("-")) {
            throw new OperatorException("Invalid operator: " + activity.getOperator());
        }

        return true;
    }

    public String doOperation(Activity activity) {
        if (activity.getOperator().equals("+")) {
            return activity.getString1() + activity.getString2();
        } else {
            StringBuilder result = new StringBuilder(activity.getString1());
            for (char c : activity.getString2().toCharArray()) {
                result = new StringBuilder(result.toString().replaceFirst(String.valueOf(c), ""));
            }
            return result.toString();
        }
    }
}
