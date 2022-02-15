package com.example.tcp.domain.compositekeys;

import java.io.Serializable;
import java.util.UUID;

public class KeyUserFollowUser implements Serializable {
    public UUID userid;
    public UUID useridfollowed;
}
