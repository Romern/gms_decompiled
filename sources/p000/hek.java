package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import java.util.Arrays;

/* renamed from: hek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hek {

    /* renamed from: a */
    public final int f19601a;

    /* renamed from: b */
    public final String f19602b;

    /* renamed from: c */
    public final String f19603c;

    /* renamed from: d */
    public final String f19604d;

    /* renamed from: e */
    public Bitmap f19605e;

    /* renamed from: f */
    public String f19606f;

    /* renamed from: g */
    private final String f19607g;

    private hek(String str, String str2, String str3, int i, String str4) {
        this.f19602b = str;
        this.f19604d = str2;
        this.f19603c = str3;
        this.f19601a = i;
        this.f19607g = str4;
    }

    /* renamed from: a */
    public static hek m14269a(Context context, InternalSignInCredentialWrapper internalSignInCredentialWrapper, Bitmap bitmap) {
        String str;
        String str2;
        boolean z = !TextUtils.isEmpty(internalSignInCredentialWrapper.f10233g.f10253f);
        Uri uri = internalSignInCredentialWrapper.f10233g.f10252e;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        if (!z && !TextUtils.isEmpty(internalSignInCredentialWrapper.f10233g.f10249b)) {
            str2 = !TextUtils.isEmpty(internalSignInCredentialWrapper.f10233g.f10249b) ? internalSignInCredentialWrapper.f10233g.f10249b : internalSignInCredentialWrapper.f10233g.f10248a;
        } else {
            str2 = internalSignInCredentialWrapper.f10233g.f10248a;
        }
        if (z) {
            String str3 = internalSignInCredentialWrapper.f10233g.f10248a;
            sdo.m34977c(str2);
            hek hek = new hek(str3, str2, context.getString(C0126R.string.credentials_assisted_hidden_password), 1, internalSignInCredentialWrapper.f10232f.type);
            hek.f19606f = str;
            hek.f19605e = bitmap;
            return hek;
        }
        String str4 = internalSignInCredentialWrapper.f10233g.f10248a;
        sdo.m34977c(str2);
        hek a = m14270a(str4, str2, internalSignInCredentialWrapper.f10233g.f10248a, internalSignInCredentialWrapper.f10232f.type);
        a.f19606f = str;
        a.f19605e = null;
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hek) {
            hek hek = (hek) obj;
            if (!bmxi.m108538a(this.f19607g, hek.f19607g) || !bmxi.m108538a(this.f19602b, hek.f19602b) || !bmxi.m108538a(this.f19603c, hek.f19603c) || !bmxi.m108538a(this.f19604d, hek.f19604d) || !bmxi.m108538a(this.f19606f, hek.f19606f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19601a), this.f19607g, this.f19602b, this.f19603c, this.f19604d, this.f19606f});
    }

    /* renamed from: a */
    public static hek m14270a(String str, String str2, String str3, String str4) {
        return new hek(str, str2, str3, 0, str4);
    }
}
