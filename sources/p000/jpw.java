package p000;

import android.util.MutableBoolean;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: jpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jpw extends jsi {

    /* renamed from: a */
    final /* synthetic */ List f23014a;

    /* renamed from: b */
    final /* synthetic */ MutableBoolean f23015b;

    public jpw(List list, MutableBoolean mutableBoolean) {
        this.f23014a = list;
        this.f23015b = mutableBoolean;
    }

    /* renamed from: a */
    public final void mo13961a(Status status, List list) {
        if (status.equals(Status.f30107a) && list != null) {
            this.f23014a.addAll(list);
            this.f23015b.value = true;
        }
    }
}
