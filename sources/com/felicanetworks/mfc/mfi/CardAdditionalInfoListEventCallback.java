package com.felicanetworks.mfc.mfi;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface CardAdditionalInfoListEventCallback extends BaseMfiEventCallback {
    void onError(int i, String str);

    void onSuccess(CardAdditionalInfo[] cardAdditionalInfoArr);
}
