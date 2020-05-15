package p000;

import android.os.Message;
import android.view.View;

/* renamed from: sa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1343sa implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1348sf f26960a;

    public C1343sa(C1348sf sfVar) {
        this.f26960a = sfVar;
    }

    public void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        C1348sf sfVar = this.f26960a;
        Message message4 = null;
        if (view == sfVar.f27005j && (message3 = sfVar.f27007l) != null) {
            message4 = Message.obtain(message3);
        } else if (view == sfVar.f27008m && (message2 = sfVar.f27010o) != null) {
            message4 = Message.obtain(message2);
        } else if (view == sfVar.f27011p && (message = sfVar.f27013r) != null) {
            message4 = Message.obtain(message);
        }
        if (message4 != null) {
            message4.sendToTarget();
        }
        C1348sf sfVar2 = this.f26960a;
        sfVar2.f26994H.obtainMessage(1, sfVar2.f26997b).sendToTarget();
    }
}
