package p000;

/* renamed from: bdrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdrv {

    /* renamed from: a */
    private Long f106330a;

    /* renamed from: b */
    private bdrw f106331b;

    /* renamed from: c */
    private Boolean f106332c;

    /* renamed from: a */
    public final bdrx mo58339a() {
        String str = this.f106330a == null ? " timeoutMillis" : "";
        if (this.f106331b == null) {
            str = str.concat(" reason");
        }
        if (this.f106332c == null) {
            str = String.valueOf(str).concat(" uploadPushNotificationPayloads");
        }
        if (str.isEmpty()) {
            return new bdrr(this.f106330a.longValue(), this.f106331b, this.f106332c.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo58340a(long j) {
        this.f106330a = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo58341a(bdrw bdrw) {
        if (bdrw != null) {
            this.f106331b = bdrw;
            return;
        }
        throw new NullPointerException("Null reason");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58342a(boolean z) {
        this.f106332c = Boolean.valueOf(z);
    }
}
