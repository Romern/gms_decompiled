package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: aosl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aosl implements aosj {

    /* renamed from: a */
    private final Context f83514a;

    /* renamed from: b */
    private final DataHolder f83515b;

    public aosl(Context context, DataHolder dataHolder) {
        this.f83514a = context;
        this.f83515b = dataHolder;
    }

    /* renamed from: a */
    public final void mo46826a(aosu aosu, String str) {
        if (sqr.m35996a(this.f83514a, str) >= 7500000) {
            new Object[1][0] = str;
            DataHolder dataHolder = this.f83515b;
            Parcel bj = aosu.mo8529bj();
            dcl.m8165a(bj, dataHolder);
            aosu.mo8528b(4, bj);
        }
    }
}
