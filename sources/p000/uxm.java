package p000;

import com.google.android.gms.drive.internal.model.File;

/* renamed from: uxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uxm extends uxv {
    public uxm(uvy uvy, vad vad) {
        super(uvy, true, vad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28099a(ujx ujx, String str) {
        return Boolean.valueOf(ujx.mo27539Q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28100a(File file, Object obj) {
        Boolean bool = (Boolean) obj;
        if (file.f31004v == null) {
            file.mo18239a(new File.Labels());
        }
        File.Labels labels = file.f31004v;
        labels.f31015c = bool.booleanValue();
        labels.f31013a.add(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28101a(ujx ujx, String str, Object obj, long j) {
        ujx.mo27588b(((Boolean) obj).booleanValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28106a(ujx ujx, ukt ukt, long j) {
        ula f = ukt.mo27666f();
        if (!f.mo27683a()) {
            f.mo27682a(Boolean.valueOf(ujx.mo27539Q()), j);
        } else {
            f.mo27680a(j);
        }
    }
}
