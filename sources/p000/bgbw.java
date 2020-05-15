package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.location.FloorChangeEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bgbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgbw extends bgdr {
    public bgbw(rsk rsk) {
        super("FloorChangeDetectionListeners", 2023, rsk);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo62606a(bgcc bgcc) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_PENDING_INTENT", bgcc.f116017h);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo62613b(bgcc bgcc) {
        this.f116172a.mo62052a(bfos.FLOOR_CHANGE_REQUEST_DROPPED, bgcc.f116017h.hashCode(), bgcc.f116017h.getTargetPackage());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62614c(bgcc bgcc) {
        this.f116172a.mo62052a(bfos.FLOOR_CHANGE_REQUEST_REMOVED, bgcc.f116017h.hashCode(), bgcc.f116017h.getTargetPackage());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo62615d(bgcc bgcc) {
        bfor bfor = this.f116172a;
        int hashCode = bgcc.f116017h.hashCode();
        String targetPackage = bgcc.f116017h.getTargetPackage();
        bfor.mo62047a(new bgdd(bfos.FLOOR_CHANGE_REQUEST_ADDED, bfor.mo62055b(), bfor.mo62045a(targetPackage), hashCode, hashCode, targetPackage, bgcc.f116022m));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int mo62616h() {
        return 2;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo62617i() {
        return Boolean.valueOf(!this.f116175h.isEmpty());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bgcc mo62607a(PendingIntent pendingIntent, Object obj, boolean z, bhcv bhcv, String str, bgns bgns) {
        Boolean bool = (Boolean) obj;
        return new bgcc(pendingIntent, 0, bgns, bhcv, z, false, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62612a(Object obj, Bundle bundle, bgcc bgcc, Intent intent) {
        List<FloorChangeEvent> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (FloorChangeEvent floorChangeEvent : list) {
            arrayList.add(sef.m35074a(floorChangeEvent));
        }
        intent.putExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_RESULT", arrayList);
        return true;
    }
}
