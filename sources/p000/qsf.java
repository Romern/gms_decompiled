package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayOutputStream;

/* renamed from: qsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsf implements rkk {

    /* renamed from: a */
    public final Status f42025a;

    /* renamed from: b */
    public final bngx f42026b;

    public qsf(Status status, bngx bngx) {
        sdo.m34959a(status);
        this.f42025a = status;
        sdo.m34959a(bngx);
        this.f42026b = bngx;
    }

    /* renamed from: b */
    public final Bundle mo24248b() {
        Bundle bundle = new Bundle();
        adbw.m50145a(bundle, "status", this.f42025a);
        bngx bngx = this.f42026b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int size = bngx.size();
        for (int i = 0; i < size; i++) {
            ((bxxc) bngx.get(i)).mo73641b(byteArrayOutputStream);
        }
        bundle.putByteArray("entities", byteArrayOutputStream.toByteArray());
        return bundle;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f42025a;
    }
}
