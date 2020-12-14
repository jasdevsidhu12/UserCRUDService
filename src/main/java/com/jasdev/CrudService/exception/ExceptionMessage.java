package com.jasdev.CrudService.exception;

public enum  ExceptionMessage {
  BAD_RESPONSE_BODY {
      public String toString() {
          return "Body Parameter Parse Error";
      }
  },
  USER_NOT_FOUND {
      public String toString() {
          return "User {name} Not Found !!";
      }
  },
  GENERAL_ERROR_RESPONSE {
      public String toString() {
          return "something is extremely wrong, please contact jasdev";
      }
  }

}
