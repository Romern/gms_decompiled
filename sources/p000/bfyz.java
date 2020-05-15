package p000;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;

/* renamed from: bfyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfyz extends adzx {

    /* renamed from: a */
    final /* synthetic */ bfzt f115758a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfyz(bfzt bfzt, String str, String str2, Handler handler) {
        super(str, str2, handler);
        this.f115758a = bfzt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        bfzt bfzt = this.f115758a;
        int i = bfzt.f115788E;
        bxvd bxvd = bfzt.f115791D;
        if (bxvd != null) {
            boolean b = bfzt.f115819x.mo62523b();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpmn bpmn = (bpmn) bxvd.f164949b;
            bpmn bpmn2 = bpmn.f138303g;
            bpmn.f138305a |= 1;
            bpmn.f138306b = b;
            bfzt bfzt2 = this.f115758a;
            bxvd bxvd2 = bfzt2.f115791D;
            boolean a = bfzt2.f115819x.mo62522a();
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bpmn bpmn3 = (bpmn) bxvd2.f164949b;
            bpmn3.f138305a |= 2;
            bpmn3.f138307c = a;
        }
        bfzt bfzt3 = this.f115758a;
        synchronized (bfzt3.f115806k) {
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                bfxc.m98132a("GeofencerStateMachine", "sendQueryLocationOptIn");
            }
            bfzt3.mo62553d(1);
        }
    }
}
