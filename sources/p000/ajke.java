package p000;

import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

/* renamed from: ajke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajke {

    /* renamed from: a */
    final /* synthetic */ ShareTarget f70784a;

    /* renamed from: b */
    final /* synthetic */ bqgy f70785b;

    /* renamed from: c */
    final /* synthetic */ NearbySharingChimeraService f70786c;

    public ajke(NearbySharingChimeraService nearbySharingChimeraService, ShareTarget shareTarget, bqgy bqgy) {
        this.f70786c = nearbySharingChimeraService;
        this.f70784a = shareTarget;
        this.f70785b = bqgy;
    }

    /* renamed from: a */
    public final void mo38720a(List list) {
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Download finished.");
        ShareTarget shareTarget = this.f70784a;
        Charset charset = NearbySharingChimeraService.f80888a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Attachment attachment = (Attachment) it.next();
            if (attachment.mo44386d()) {
                shareTarget.mo44497a((TextAttachment) attachment);
            } else if (attachment.mo44385c()) {
                shareTarget.mo44496a((FileAttachment) attachment);
            } else if (attachment.mo44387e()) {
                shareTarget.mo44498a((WifiCredentialsAttachment) attachment);
            }
        }
        this.f70785b.mo69138b((Object) 0);
    }
}
