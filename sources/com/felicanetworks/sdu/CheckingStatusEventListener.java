package com.felicanetworks.sdu;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface CheckingStatusEventListener {
    public static final int CHIP_STATUS_ALREADY_DIVIDED = 3;
    public static final int CHIP_STATUS_NEED_DIVIDING = 2;
    public static final int CHIP_STATUS_NEED_FORMATTING = 1;
    public static final int CHIP_STATUS_UNKNOWN = 4;

    void errorOccurred(ErrorInfo errorInfo);

    void finished(int i);
}
