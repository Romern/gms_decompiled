package p000;

/* renamed from: bkrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkrz extends bksa {
    public bkrz(bksb bksb) {
        super(bksb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66291a(bkqo bkqo) {
        return bkqo != null ? bkqo.mo66246b(this) : "null";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo66293b(bkqo bkqo) {
        String f = bkqo.mo66249f();
        String d = bkqo.mo66247d();
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 4 + String.valueOf(d).length());
        sb.append("<");
        sb.append(f);
        sb.append(": ");
        sb.append(d);
        sb.append(">");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66292a(blgm blgm) {
        StringBuilder sb = new StringBuilder();
        bkqg.m106278a(blgm, new bkxh(sb));
        return sb.toString();
    }
}
