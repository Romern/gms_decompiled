package p000;

import android.content.ContentValues;

/* renamed from: sin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sin extends sio {

    /* renamed from: a */
    public final ContentValues f44539a = new ContentValues();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25600a(String str, double d) {
        this.f44539a.put(str, Double.valueOf(d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Object mo17863c(String str) {
        return this.f44539a.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo17864d(String str) {
        return this.f44539a.containsKey(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25601a(String str, float f) {
        this.f44539a.put(str, Float.valueOf(f));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25602a(String str, int i) {
        this.f44539a.put(str, Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25603a(String str, long j) {
        this.f44539a.put(str, Long.valueOf(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25604a(String str, String str2) {
        this.f44539a.put(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25605a(String str, boolean z) {
        this.f44539a.put(str, Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25606a(String str, byte[] bArr) {
        this.f44539a.put(str, bArr);
    }
}
