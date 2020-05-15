package p000;

/* renamed from: axxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axxi {

    /* renamed from: a */
    public final axue f96646a;

    /* renamed from: b */
    public axxf f96647b;

    /* renamed from: c */
    public boolean f96648c;

    /* renamed from: d */
    public boolean f96649d;

    /* renamed from: e */
    public String f96650e;

    /* renamed from: f */
    public long f96651f = -1;

    /* renamed from: g */
    public long f96652g;

    /* renamed from: h */
    public long f96653h;

    public axxi(axue axue) {
        this.f96646a = axue;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemRecord[");
        sb.append(this.f96646a.f96377a);
        sb.append(",");
        sb.append(this.f96646a.f96379c);
        sb.append(",");
        sb.append(this.f96647b.mo53709a(true));
        sb.append(",sourceId=");
        sb.append(this.f96650e);
        sb.append(",seqId=");
        sb.append(this.f96651f);
        sb.append(",v1SeqId=");
        sb.append(this.f96652g);
        sb.append(",lastModified=");
        sb.append(this.f96653h);
        sb.append(",assetsAreReady=");
        sb.append(this.f96649d);
        if (this.f96648c) {
            sb.append(", DELETED");
        }
        sb.append("]");
        return sb.toString();
    }
}
