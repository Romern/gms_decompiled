package p000;

import android.os.Bundle;
import com.google.android.gms.trustagent.common.receiver.ScreenOnOffReceiver;

/* renamed from: aupe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aupe extends deu implements auny {

    /* renamed from: b */
    private ScreenOnOffReceiver f92246b;

    /* renamed from: b */
    public final void mo50641b() {
    }

    /* renamed from: bO */
    public void mo50642bO() {
        finish();
    }

    /* renamed from: c */
    public final void mo50643c() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ScreenOnOffReceiver screenOnOffReceiver = new ScreenOnOffReceiver(rpr.m34216b(), this);
        this.f92246b = screenOnOffReceiver;
        screenOnOffReceiver.mo59552a();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f92246b.mo59553b();
        super.onDestroy();
    }
}
