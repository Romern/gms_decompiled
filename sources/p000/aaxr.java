package p000;

import android.content.Context;
import android.util.Log;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aaxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxr extends abgl {

    /* renamed from: f */
    private final HelpConfig f56783f;

    /* renamed from: g */
    private final String f56784g;

    public aaxr(GoogleHelpChimeraService googleHelpChimeraService, String str, abcf abcf, HelpConfig helpConfig, String str2) {
        super("RequestChatSupportOperation", googleHelpChimeraService, str, abcf);
        this.f56783f = helpConfig;
        this.f56784g = str2;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        if (!this.f56783f.mo43240o()) {
            Log.w("gH_RequestChatSupportOp", "Pool ID is required for Chat support.");
            this.f57414e.mo32004c();
            return;
        }
        RequestFuture newFuture = RequestFuture.newFuture();
        GoogleHelpChimeraService googleHelpChimeraService = this.f57412a;
        aaxl.m47163a(googleHelpChimeraService, this.f56783f, googleHelpChimeraService.mo43374a(), -1, this.f56784g, newFuture, newFuture);
        try {
            int i = ((bzqe) newFuture.get(ceeg.m136412q(), TimeUnit.SECONDS)).f170978a;
            if (i >= 0) {
                this.f57414e.mo32000a(i);
                ChatRequestAndConversationChimeraService.m66446a(this.f57412a, this.f56783f);
                return;
            }
            Log.w("gH_RequestChatSupportOp", "Chat queue position is invalid.");
            this.f57414e.mo32004c();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("gH_RequestChatSupportOp", "Chat support request failed.", e);
            this.f57414e.mo32004c();
        }
    }
}
