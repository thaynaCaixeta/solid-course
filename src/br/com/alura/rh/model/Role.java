package br.com.alura.rh.model;

public enum Role {

	ASSISTANT {
		@Override
		public Role nextRole() {
			return Role.ANALYST;
		}
	},
	ANALYST {
		@Override
		public Role nextRole() {
			return Role.SPECIALIST;
		}
	},
	SPECIALIST {
		@Override
		public Role nextRole() {
			return Role.MANAGER;
		}
	},
	MANAGER {
		@Override
		public Role nextRole() {
			return MANAGER;
		}
	};
	
	public abstract Role nextRole();
}
