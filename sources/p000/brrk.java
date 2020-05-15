package p000;

import android.text.TextUtils;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.MfaInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: brrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brrk implements brpk {

    /* renamed from: a */
    public boolean f143234a;

    /* renamed from: b */
    public String f143235b;

    /* renamed from: c */
    public String f143236c;

    /* renamed from: d */
    public long f143237d;

    /* renamed from: e */
    public String f143238e;

    /* renamed from: f */
    public String f143239f;

    /* renamed from: g */
    public String f143240g;

    /* renamed from: h */
    public boolean f143241h;

    /* renamed from: i */
    public String f143242i;

    /* renamed from: j */
    public String f143243j;

    /* renamed from: k */
    public List f143244k;

    /* renamed from: l */
    public String f143245l;

    /* renamed from: m */
    private String f143246m;

    /* renamed from: n */
    private String f143247n;

    /* renamed from: o */
    private String f143248o;

    /* renamed from: p */
    private String f143249p;

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bklc.f124698t.mo74142c(7);
    }

    /* renamed from: b */
    public final boolean mo69818b() {
        return !TextUtils.isEmpty(this.f143245l);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: c */
    public final DefaultOAuthCredential mo69819c() {
        if (TextUtils.isEmpty(this.f143246m) && TextUtils.isEmpty(this.f143247n)) {
            return null;
        }
        String str = this.f143239f;
        String str2 = this.f143247n;
        String str3 = this.f143246m;
        String str4 = this.f143249p;
        String str5 = this.f143248o;
        sdo.m34969a(str, (Object) "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new DefaultOAuthCredential(str, str2, str3, null, str4, str5, null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        if (bxxc instanceof bklc) {
            bklc bklc = (bklc) bxxc;
            this.f143234a = bklc.f124706g;
            this.f143235b = stm.m36300b(bklc.f124705f);
            this.f143236c = stm.m36300b(bklc.f124709j);
            this.f143237d = bklc.f124710k;
            stm.m36300b(bklc.f124703d);
            this.f143238e = stm.m36300b(bklc.f124701b);
            stm.m36300b(bklc.f124704e);
            stm.m36300b(bklc.f124702c);
            this.f143239f = stm.m36300b(bklc.f124700a);
            this.f143240g = stm.m36300b(bklc.f124712m);
            this.f143241h = bklc.f124714o;
            this.f143246m = bklc.f124707h;
            this.f143247n = bklc.f124711l;
            this.f143242i = stm.m36300b(bklc.f124713n);
            this.f143249p = stm.m36300b(bklc.f124715p);
            this.f143243j = stm.m36300b(bklc.f124716q);
            this.f143244k = new ArrayList();
            bxwc bxwc = bklc.f124718s;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                this.f143244k.add(MfaInfo.m118902a((bkll) bxwc.get(i)));
            }
            this.f143245l = stm.m36300b(bklc.f124717r);
            this.f143248o = stm.m36300b(bklc.f124708i);
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of VerifyAssertionResponse.");
    }
}
