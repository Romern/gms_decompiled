package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: amqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqk extends aaab {

    /* renamed from: a */
    private final amvj f75752a;

    /* renamed from: b */
    private final alss f75753b;

    /* renamed from: c */
    private final int[] f75754c;

    public amqk(alss alss, Context context, int[] iArr) {
        super(208, "RemoveAccountCategoryFromBackupAndSync");
        this.f75752a = amvj.m63368a(context);
        this.f75754c = iArr;
        this.f75753b = alss;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f75752a.mo41380b(this.f75754c);
        this.f75753b.mo40726c(Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f75753b.mo40726c(status);
    }
}
