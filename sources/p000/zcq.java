package p000;

import com.google.android.gms.fitness.request.PurgeDataSourcesRequest;
import java.util.List;

/* renamed from: zcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zcq extends zak {

    /* renamed from: a */
    final /* synthetic */ List f54921a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zcq(rkb rkb, List list) {
        super(rkb);
        this.f54921a = list;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.fitness.request.PurgeDataSourcesRequest.<init>(zcl, java.util.List):void
     arg types: [zcs, java.util.List]
     candidates:
      com.google.android.gms.fitness.request.PurgeDataSourcesRequest.<init>(android.os.IBinder, java.util.List):void
      com.google.android.gms.fitness.request.PurgeDataSourcesRequest.<init>(zcl, java.util.List):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((zbt) ((zam) rjd).mo25289B()).mo30916a(new PurgeDataSourcesRequest((zcl) new zcs(this), this.f54921a));
    }
}
