/*
 * Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package jdk.nashorn.api.tree;

/**
 * A tree node for the conditional operator ? :.
 *
 * For example:
 * <pre>
 *   <em>condition</em> ? <em>trueExpression</em> : <em>falseExpression</em>
 * </pre>
 *
 * @since 9
 */
public interface ConditionalExpressionTree extends ExpressionTree {
    /**
     * Returns the condition expression of this ternary expression.
     *
     * @return the condition expression
     */
    ExpressionTree getCondition();

    /**
     * Returns the true part of this ternary expression.
     *
     * @return the 'true' part expression
     */
    ExpressionTree getTrueExpression();

    /**
     * Returns the false part of this ternary expression.
     *
     * @return the 'false' part expression
     */
    ExpressionTree getFalseExpression();
}
