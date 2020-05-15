package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: brky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brky {
    /* renamed from: a */
    public static brrp m114105a(Context context, PhoneAuthCredential phoneAuthCredential, String str) {
        if (phoneAuthCredential.f152403c) {
            if (!m114106a(context, phoneAuthCredential.f152404d, str)) {
                return null;
            }
            String a = brla.f142902a.mo69670a(context, phoneAuthCredential.f152404d);
            String str2 = phoneAuthCredential.f152404d;
            boolean z = phoneAuthCredential.f152405e;
            brrp brrp = new brrp();
            brrp.f143260a = true;
            sdo.m34977c(a);
            brrp.f143262c = a;
            sdo.m34977c(str2);
            brrp.f143261b = str2;
            brrp.f143267h = z;
            return brrp;
        } else if (TextUtils.isEmpty(phoneAuthCredential.f152406f)) {
            String str3 = phoneAuthCredential.f152401a;
            String str4 = phoneAuthCredential.f152402b;
            boolean z2 = phoneAuthCredential.f152405e;
            brrp brrp2 = new brrp();
            brrp2.f143260a = false;
            sdo.m34977c(str3);
            brrp2.f143263d = str3;
            sdo.m34977c(str4);
            brrp2.f143264e = str4;
            brrp2.f143267h = z2;
            return brrp2;
        } else {
            String str5 = phoneAuthCredential.f152404d;
            String str6 = phoneAuthCredential.f152406f;
            boolean z3 = phoneAuthCredential.f152405e;
            brrp brrp3 = new brrp();
            brrp3.f143260a = false;
            sdo.m34977c(str5);
            brrp3.f143261b = str5;
            sdo.m34977c(str6);
            brrp3.f143265f = str6;
            brrp3.f143267h = z3;
            return brrp3;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: brla.a(android.content.Context, java.lang.String, boolean):boolean
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      brla.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      brla.a(android.content.Context, java.lang.String, boolean):boolean */
    /* renamed from: a */
    public static boolean m114106a(Context context, String str, String str2) {
        if (brla.f142902a.mo69675a(context, str, false)) {
            return true;
        }
        Log.e(str2, "Phone Number instant validation failed - phone number has no verificationProof.");
        return false;
    }
}
