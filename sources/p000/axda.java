package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: axda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axda {

    /* renamed from: a */
    public final SharedPreferences f95820a;

    /* renamed from: b */
    private final Context f95821b;

    /* renamed from: a */
    public final String mo53032a(String str, int i, Account account) {
        bxvd da = byac.f165231f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byac byac = (byac) da.f164949b;
        str.getClass();
        int i2 = byac.f165233a | 4;
        byac.f165233a = i2;
        byac.f165236d = str;
        byac.f165233a = i2 | 2;
        byac.f165235c = i;
        String str2 = account.name;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byac byac2 = (byac) da.f164949b;
        str2.getClass();
        byac2.f165233a |= 1;
        byac2.f165234b = str2;
        String a = bjyw.m104936a(this.f95821b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byac byac3 = (byac) da.f164949b;
        a.getClass();
        byac3.f165233a |= 8;
        byac3.f165237e = a;
        return bjvp.m104734a((byac) da.mo74062i());
    }

    public axda(Context context) {
        this.f95821b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.wallet.upstream.InitializeResponseCache", 0);
        this.f95820a = sharedPreferences;
        if (sharedPreferences.getInt("version_key", 1) <= 0) {
            this.f95820a.edit().clear().apply();
        }
        this.f95820a.edit().putInt("version_key", 1).apply();
    }
}
