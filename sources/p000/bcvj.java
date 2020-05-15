package p000;

import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.File;

/* renamed from: bcvj */
final /* synthetic */ class bcvj implements bmxj {

    /* renamed from: a */
    private final bcvt f104992a;

    /* renamed from: b */
    private final bctr f104993b;

    /* renamed from: c */
    private final bcwp f104994c;

    public bcvj(bcvt bcvt, bctr bctr, bcwp bcwp) {
        this.f104992a = bcvt;
        this.f104993b = bctr;
        this.f104994c = bcwp;
    }

    public final Object apply(Object obj) {
        bcvt bcvt = this.f104992a;
        bctr bctr = this.f104993b;
        bcwp bcwp = this.f104994c;
        bcvx bcvx = (bcvx) obj;
        ConversationId c = bctr.mo57361c();
        String a = bcwp.mo57617a();
        File file = new File(bcvt.mo57604b(c, a));
        File file2 = new File(bcvt.mo57600a(c, a));
        file2.getParentFile().mkdirs();
        file.renameTo(file2);
        return Uri.fromFile(new File(file2.getAbsolutePath())).toString();
    }
}
