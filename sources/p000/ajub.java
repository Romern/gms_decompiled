package p000;

import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: ajub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajub {

    /* renamed from: a */
    public String f71284a;

    /* renamed from: b */
    private int f71285b;

    /* renamed from: c */
    private float f71286c;

    /* renamed from: d */
    private boolean f71287d = true;

    public ajub(int i) {
        this.f71285b = i;
    }

    /* renamed from: a */
    public static ajub m59030a(TransferMetadata transferMetadata) {
        ajub ajub = new ajub(transferMetadata.f81052a);
        ajub.f71285b = transferMetadata.f81052a;
        ajub.f71286c = transferMetadata.f81053b;
        ajub.f71284a = transferMetadata.f81054c;
        ajub.f71287d = transferMetadata.f81055d;
        return ajub;
    }

    /* renamed from: b */
    public final void mo38918b() {
        this.f71287d = false;
    }

    /* renamed from: a */
    public final TransferMetadata mo38916a() {
        boolean z;
        int i = this.f71285b;
        float f = this.f71286c;
        String str = this.f71284a;
        boolean z2 = this.f71287d;
        switch (i) {
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                z = true;
                break;
            case 5:
            case 12:
            default:
                z = false;
                break;
        }
        return new TransferMetadata(i, f, str, z2, z);
    }

    /* renamed from: a */
    public final void mo38917a(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 100.0f) {
            z = true;
        }
        sdo.m34975b(z, "Progress must be within 0 and 100");
        this.f71286c = f;
    }
}
