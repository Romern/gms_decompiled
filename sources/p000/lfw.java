package p000;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/* renamed from: lfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lfw implements lgd {

    /* renamed from: a */
    public final Context f26011a;

    public lfw(Context context) {
        this.f26011a = context;
    }

    /* renamed from: a */
    public final bngx mo15054a(lgc lgc) {
        kjs kjs = lgc.f26026b;
        return bngx.m109368a((Collection) ((List) kjs.f24277b.stream().map(new lfq(this, kjs.f24278c, lgc)).filter(lfr.f26004a).map(lfs.f26005a).map(lft.f26006a).collect(Collectors.toList())));
    }
}
