package com.example.solid.model;

public enum Categories {

	BACK_END_PROGRAMMING {
		@Override
		public Categories getNext() {
			return FRONT_END_PROGRAMMING;

		}
	},

	FRONT_END_PROGRAMMING {
		@Override
		public Categories getNext() {
			return BACK_END_PROGRAMMING;
		}
	},

	FULL_STACK_PROGRAMMING {
		@Override
		public Categories getNext() {
			return FULL_STACK_PROGRAMMING;
		}
	};

	public abstract Categories getNext();

}
