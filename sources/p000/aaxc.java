package p000;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.lang.ref.WeakReference;

/* renamed from: aaxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxc implements Runnable {

    /* renamed from: a */
    private final WeakReference f56740a;

    /* renamed from: b */
    private final HelpConfig f56741b;

    public aaxc(HelpConfig helpConfig, Context context) {
        this.f56740a = new WeakReference(context);
        this.f56741b = helpConfig;
    }

    public final void run() {
        Context context = (Context) this.f56740a.get();
        if (context != null) {
            ChatRequestAndConversationChimeraService.m66454d(context, this.f56741b);
        }
    }
}
