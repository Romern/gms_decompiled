package com.google.android.gms.nearby.discovery.devices;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OptionalModuleActivityProxy$InstallCompleteReceiver extends aacn {

    /* renamed from: a */
    private final Intent f80489a;

    /* renamed from: b */
    private final WeakReference f80490b;

    public OptionalModuleActivityProxy$InstallCompleteReceiver(deu deu, Intent intent) {
        super("nearby");
        this.f80490b = new WeakReference(deu);
        this.f80489a = intent;
        deu.registerReceiver(this, new IntentFilter("com.google.location.nearby.common.fastpair.ACTION_FASTPAIR_MODULE_ENABLED"));
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.location.nearby.common.fastpair.ACTION_FASTPAIR_MODULE_ENABLED".equals(intent.getAction())) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("loadFastPairModule: Receive fastpair module enable broadcast.");
            deu deu = (deu) this.f80490b.get();
            if (deu == null) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("loadFastPairModule completed but activity reference is missing!");
            } else if (deu.isDestroyed() || deu.isFinishing()) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("loadFastPairModule completed but activity is finishing!");
            } else {
                try {
                    deu.startActivity(this.f80489a);
                    deu.finish();
                } catch (ActivityNotFoundException e) {
                    bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68420a("Optional module download completed but activity:%s not found!", this.f80489a.getComponent().getClassName());
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo44193a(deu deu) {
        deu.unregisterReceiver(this);
    }
}
