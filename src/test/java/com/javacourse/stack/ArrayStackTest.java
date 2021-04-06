package com.javacourse.stack;


import com.javacourse.stack.extremum.MaxTest;
import com.javacourse.stack.extremum.MinTest;
import com.javacourse.stack.stack.ComplexTest;
import com.javacourse.stack.stack.PeekStackTest;
import com.javacourse.stack.stack.PopStackTest;
import com.javacourse.stack.stack.PushStackTest;
import com.javacourse.stack.stack.TypedStackTest;

public class ArrayStackTest implements PushStackTest,
                                       PopStackTest,
                                       PeekStackTest,
                                       TypedStackTest,
                                       ComplexTest,
                                       MinTest,
                                       MaxTest {

	@Override
	public Stack<Integer> getIntegerStackImpl() {
		return new ArrayStack<>();
	}

	@Override
	public Stack getUntypedStack() {
		return new ArrayStack();
	}

	@Override
	public ExtremumStack<Integer> getExtremumStackImpl() {
		return new ArrayStack<>();
	}
}
