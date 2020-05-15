package p000;

import com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Result;
import com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Step;

/* renamed from: aibo */
public final /* synthetic */ class aibo implements ayqh {

    /* renamed from: a */
    private final aics f68620a;

    /* renamed from: b */
    private final String f68621b;

    public aibo(aics aics, String str) {
        this.f68620a = aics;
        this.f68621b = str;
    }

    /* renamed from: a */
    public final void mo37372a(int i, String str) {
        aics aics = this.f68620a;
        String str2 = this.f68621b;
        if (i - 1 != 1) {
            ayqx.m84633a(aics.f68708e, str2, BroadcastConstants$Step.FINISHED, BroadcastConstants$Result.FAILURE);
        } else {
            ayqx.m84633a(aics.f68708e, str2, BroadcastConstants$Step.FINISHED, BroadcastConstants$Result.SUCCESS);
        }
    }
}
