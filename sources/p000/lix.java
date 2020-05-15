package p000;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: lix */
final /* synthetic */ class lix implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final lja f26177a;

    public lix(lja lja) {
        this.f26177a = lja;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f26177a.f26159a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://passwords.google.com/")));
    }
}
