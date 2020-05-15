package p000;

import android.text.TextUtils;

/* renamed from: ptb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ptb {

    /* renamed from: s */
    public final ptx f40173s;

    /* renamed from: t */
    public final String f40174t;

    /* renamed from: u */
    public pud f40175u;

    protected ptb(String str, String str2, String str3) {
        ptk.m31232a(str);
        this.f40174t = str;
        this.f40173s = new ptx(str2);
        if (!TextUtils.isEmpty(str3)) {
            this.f40173s.mo23669a(str3);
        }
    }

    /* renamed from: a */
    public final void mo23630a(String str, long j, String str2) {
        Object[] objArr = {str, str2};
        this.f40175u.mo23228a(this.f40174t, str, j, str2);
    }

    /* renamed from: a */
    public void mo23348a(byte[] bArr) {
    }

    /* renamed from: b */
    public void mo23345b(String str) {
    }

    /* renamed from: c */
    public final long mo23633c() {
        return this.f40175u.mo23227a();
    }

    /* renamed from: l */
    public void mo23629l() {
    }

    /* renamed from: a */
    public final void mo23631a(pud pud) {
        this.f40175u = pud;
        if (pud == null) {
            mo23629l();
        }
    }

    /* renamed from: b */
    public final void mo23632b(String str, long j, String str2) {
        Object[] objArr = {str, str2};
        this.f40175u.mo23231b(this.f40174t, str, j, str2);
    }
}
