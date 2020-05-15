package p000;

import android.content.ContentValues;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.reminders.AccountState;

/* renamed from: aovx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovx extends aove {

    /* renamed from: b */
    private final String f83705b;

    /* renamed from: c */
    private final AccountState f83706c;

    public aovx(aost aost, String str, AccountState accountState) {
        super(aost, "SetAccountState");
        this.f83705b = str;
        this.f83706c = accountState;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        long j;
        new Object[1][0] = this;
        aosi a = aosf.m69445a(context, this.f83705b);
        if (a == null) {
            this.f83667a.mo46830a(new Status(6000));
            return;
        }
        Long l = a.f83511e;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        for (int i = 0; i < 64; i++) {
            AccountState accountState = this.f83706c;
            if (accountState.f107032b[i]) {
                j = aowr.m69715a(j, i, accountState.f107031a[i]);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_state", Long.valueOf(j));
        context.getContentResolver().update(aosy.f83568a, contentValues, "account_name=?", new String[]{this.f83705b});
        this.f83667a.mo46830a(new Status(0));
    }
}
