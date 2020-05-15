package com.google.android.gms.nearby.sharing;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import com.google.android.chimera.ChooserTargetService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DirectShareChimeraService extends ChooserTargetService implements ajud, ajsn {

    /* renamed from: a */
    private Set f80878a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    private CountDownLatch f80879b = new CountDownLatch(1);

    /* renamed from: c */
    private ajty f80880c;

    /* renamed from: a */
    public final void mo38707a(ShareTarget shareTarget) {
        if (this.f80879b.getCount() != 0) {
            long I = cfov.f185185a.mo6606a().mo82273I();
            this.f80878a.add(shareTarget);
            if (((long) this.f80878a.size()) >= I) {
                this.f80879b.countDown();
                ((bnsl) ajvp.f71371a.mo68390d()).mo68415a("Discovered required maximum %s share targets for direct share.", I);
            }
        }
    }

    /* renamed from: a */
    public final void mo38708a(ShareTarget shareTarget, int i) {
    }

    /* renamed from: a */
    public final void mo38711a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
    }

    /* renamed from: b */
    public final void mo38709b(ShareTarget shareTarget) {
        if (this.f80879b.getCount() != 0) {
            this.f80878a.remove(shareTarget);
        }
    }

    public final void onDestroy() {
        this.f80879b.countDown();
        super.onDestroy();
    }

    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f80878a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f80879b = new CountDownLatch(1);
        if (this.f80880c == null) {
            this.f80880c = ahcb.m55442c(this);
        }
        this.f80880c.mo38902a(this, this, 2);
        ArrayList arrayList = new ArrayList();
        try {
            long J = cfov.f185185a.mo6606a().mo82274J();
            if (!this.f80879b.await(J, TimeUnit.MILLISECONDS)) {
                ((bnsl) ajvp.f71371a.mo68390d()).mo68415a("Discovery timed out when reporting chooser targets in %s ms.", J);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        ArrayList arrayList2 = new ArrayList(this.f80878a);
        Collections.sort(arrayList2, ajiz.f70730a);
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ShareTarget shareTarget = (ShareTarget) arrayList2.get(i);
            Bundle bundle = new Bundle();
            bundle.putByteArray("direct_share_target_bytes", sef.m35074a(shareTarget));
            arrayList.add(new ChooserTarget(shareTarget.f81029b, akia.m59781a(new ajwv(this, shareTarget)), 1.0f, new ComponentName(getPackageName(), "com.google.android.gms.nearby.sharing.InternalShareSheetActivity"), bundle));
        }
        this.f80880c.mo38906b((ajud) this);
        ((bnsl) ajvp.f71371a.mo68390d()).mo68412a("Reporting %s chooser targets in %s ms.", arrayList.size(), System.currentTimeMillis() - currentTimeMillis);
        return arrayList;
    }
}
