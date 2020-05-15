package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;
import java.util.Locale;

/* renamed from: hbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hbj implements hep {

    /* renamed from: a */
    public final Context f19411a;

    /* renamed from: b */
    public final String f19412b;

    /* renamed from: c */
    public final AuthorizationRequest f19413c;

    /* renamed from: d */
    public final int f19414d;

    /* renamed from: e */
    public final ixl f19415e;

    /* renamed from: f */
    public final List f19416f;

    /* renamed from: g */
    private final String f19417g;

    /* renamed from: h */
    private final qws f19418h;

    public hbj(Context context, String str, String str2, AuthorizationRequest authorizationRequest, qws qws) {
        sdo.m34959a(context);
        this.f19411a = context;
        sdo.m34977c(str);
        this.f19412b = str;
        sdo.m34977c(str2);
        this.f19417g = str2;
        sdo.m34959a(authorizationRequest);
        this.f19413c = authorizationRequest;
        this.f19418h = qws;
        this.f19414d = spn.m35897i(context.getApplicationContext(), str);
        this.f19415e = aczw.m50063a(context.getApplicationContext());
        this.f19416f = authorizationRequest.f10199a;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_AUTHORIZE;
    }

    /* renamed from: b */
    public final bqgg mo12376b() {
        AuthorizationRequest authorizationRequest = this.f19413c;
        String str = this.f19417g;
        Intent intent = new Intent("com.google.android.gms.auth.api.credentials.AUTHORIZATION").setPackage("com.google.android.gms");
        sef.m35071a(authorizationRequest, intent, "authorization_request");
        intent.putExtra("session_id", str);
        Context context = this.f19411a;
        int i = Build.VERSION.SDK_INT;
        return bqga.m112775a(new AuthorizationResult(null, null, null, bngx.m109376e(), null, spn.m35844a(context, intent, 1275068416)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0124, code lost:
        if (r1.endsWith(r0.length() == 0 ? new java.lang.String("@") : "@".concat(r0)) != false) goto L_0x0139;
     */
    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        boolean z;
        Iterable a = bnjd.m109575a((Iterable) this.f19413c.f10199a, hbh.f19409a);
        bxvd da = bomr.f133700h.mo74144da();
        boolean z2 = this.f19413c.f10202d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bomr bomr = (bomr) da.f164949b;
        int i = bomr.f133702a | 2;
        bomr.f133702a = i;
        bomr.f133705d = z2;
        AuthorizationRequest authorizationRequest = this.f19413c;
        boolean z3 = authorizationRequest.f10201c;
        int i2 = i | 1;
        bomr.f133702a = i2;
        bomr.f133704c = z3;
        if (authorizationRequest.f10203e != null) {
            z = true;
        } else {
            z = false;
        }
        bomr.f133702a = i2 | 4;
        bomr.f133706e = z;
        boolean z4 = !TextUtils.isEmpty(authorizationRequest.f10204f);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bomr bomr2 = (bomr) da.f164949b;
        bomr2.f133702a |= 8;
        bomr2.f133707f = z4;
        if (!bomr2.f133703b.mo73666a()) {
            bomr2.f133703b = GeneratedMessageLite.m124021a(bomr2.f133703b);
        }
        bxsy.m123078a(a, bomr2.f133703b);
        String str = this.f19412b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bomr bomr3 = (bomr) da.f164949b;
        str.getClass();
        bomr3.f133702a |= 16;
        bomr3.f133708g = str;
        bomr bomr4 = (bomr) da.mo74062i();
        qws qws = this.f19418h;
        bxvd da2 = bong.f133782r.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bong bong = (bong) da2.f164949b;
        bong.f133785b = 15;
        int i3 = bong.f133784a | 1;
        bong.f133784a = i3;
        String str2 = this.f19417g;
        str2.getClass();
        int i4 = i3 | 2;
        bong.f133784a = i4;
        bong.f133786c = str2;
        bomr4.getClass();
        bong.f133799p = bomr4;
        bong.f133784a = i4 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        qws.mo24333a(da2.mo74062i()).mo24327b();
        Account account = this.f19413c.f10203e;
        if (account == null) {
            account = soz.m35793b(this.f19411a, this.f19412b);
        }
        if (account == null) {
            return mo12376b();
        }
        String str3 = this.f19413c.f10204f;
        if (soz.m35796b(this.f19411a.getApplicationContext(), account, this.f19412b)) {
            if (!TextUtils.isEmpty(str3)) {
                String lowerCase = account.name.toLowerCase(Locale.ROOT);
                String valueOf = String.valueOf(str3.toLowerCase(Locale.ROOT));
            }
            return bqdx.m112674a(bqga.m112778a(new hbg(this, account), bqfb.INSTANCE), new hbf(this), bqfb.INSTANCE);
        }
        if (this.f19413c.f10203e == null) {
            return mo12376b();
        }
        throw adbe.m50106a(28433);
    }
}
