package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: rkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rkt extends rkx {

    /* renamed from: a */
    protected final rle f43193a;

    public rkt(int i, rle rle) {
        super(i);
        this.f43193a = rle;
    }

    /* renamed from: a */
    public final void mo24834a(Status status) {
        this.f43193a.mo9481a(status);
    }

    /* renamed from: b */
    public final void mo24837b(rni rni) {
        try {
            this.f43193a.mo24856b(rni.f43369b);
        } catch (RuntimeException e) {
            mo24835a(e);
        }
    }

    /* renamed from: a */
    public final void mo24835a(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f43193a.mo9481a(new Status(10, sb.toString()));
    }

    /* renamed from: a */
    public final void mo24836a(rmc rmc, boolean z) {
        rle rle = this.f43193a;
        rmc.f43271a.put(rle, Boolean.valueOf(z));
        rle.mo9457a((rkd) new rma(rmc, rle));
    }
}
