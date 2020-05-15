package p000;

/* renamed from: onw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class onw {

    /* renamed from: a */
    private Boolean f38047a;

    /* renamed from: b */
    private Boolean f38048b;

    /* renamed from: c */
    private Boolean f38049c;

    /* renamed from: d */
    private Boolean f38050d;

    /* renamed from: e */
    private Boolean f38051e;

    /* renamed from: f */
    private Boolean f38052f;

    /* renamed from: g */
    private Boolean f38053g;

    /* renamed from: h */
    private Boolean f38054h;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final onx mo22369a() {
        String str = this.f38047a == null ? " configured" : "";
        if (this.f38048b == null) {
            str = str.concat(" connected");
        }
        if (this.f38049c == null) {
            str = String.valueOf(str).concat(" dataUnlocked");
        }
        if (this.f38050d == null) {
            str = String.valueOf(str).concat(" functionAccessory");
        }
        if (this.f38051e == null) {
            str = String.valueOf(str).concat(" functionAdb");
        }
        if (this.f38052f == null) {
            str = String.valueOf(str).concat(" functionAudioSource");
        }
        if (this.f38053g == null) {
            str = String.valueOf(str).concat(" functionMtp");
        }
        if (this.f38054h == null) {
            str = String.valueOf(str).concat(" functionPtp");
        }
        if (str.isEmpty()) {
            return new omw(this.f38047a.booleanValue(), this.f38048b.booleanValue(), this.f38049c.booleanValue(), this.f38050d.booleanValue(), this.f38051e.booleanValue(), this.f38052f.booleanValue(), this.f38053g.booleanValue(), this.f38054h.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo22371b(boolean z) {
        this.f38048b = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo22372c(boolean z) {
        this.f38049c = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo22373d(boolean z) {
        this.f38050d = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo22374e(boolean z) {
        this.f38051e = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo22375f(boolean z) {
        this.f38052f = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo22376g(boolean z) {
        this.f38053g = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo22377h(boolean z) {
        this.f38054h = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22370a(boolean z) {
        this.f38047a = Boolean.valueOf(z);
    }
}
