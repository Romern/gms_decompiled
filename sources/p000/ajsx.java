package p000;

import android.content.Intent;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.SendParams;

/* renamed from: ajsx */
public final /* synthetic */ class ajsx implements roo {

    /* renamed from: a */
    private final ShareTarget f71255a;

    /* renamed from: b */
    private final Intent f71256b;

    public ajsx(ShareTarget shareTarget, Intent intent) {
        this.f71255a = shareTarget;
        this.f71256b = intent;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        ShareTarget shareTarget = this.f71255a;
        Intent intent = this.f71256b;
        int i = ajty.f71279a;
        akar akar = new akar();
        SendParams sendParams = akar.f71542a;
        sendParams.f81119a = shareTarget;
        sendParams.f81120b = intent;
        rnt a = ajty.m59007a((aucf) obj2);
        SendParams sendParams2 = akar.f71542a;
        sendParams2.f81121c = a;
        ((ajyq) ((akbf) obj).mo25289B()).mo38652a(sendParams2);
    }
}
