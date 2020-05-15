package com.google.android.gms.autofill.service.fill.plugin;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.data.DataIntent$ResultTransformer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ManualPasswordPickerFillPlugin$PasswordPickerTransformer implements DataIntent$ResultTransformer {
    public static final Parcelable.Creator CREATOR = new lgi();

    /* renamed from: a */
    private final kcv f11676a;

    public ManualPasswordPickerFillPlugin$PasswordPickerTransformer(kcv kcv) {
        this.f11676a = kcv;
    }

    /* renamed from: a */
    public final Object mo7934a(int i, Intent intent) {
        if (i != -1) {
            return null;
        }
        String stringExtra = intent.getStringExtra("pwm.DataFieldNames.pickerUsername");
        String stringExtra2 = intent.getStringExtra("pwm.DataFieldNames.pickerPassword");
        if (!bmxx.m108577a(stringExtra) && !bmxx.m108577a(stringExtra2)) {
            return new Credential(stringExtra, new kdj(stringExtra2), this.f11676a);
        }
        ((bnsl) lgj.f26037a.mo68388c()).mo68405a("Empty username or password returned when picking password.");
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        kcx.m17655a(this.f11676a, parcel);
    }
}
