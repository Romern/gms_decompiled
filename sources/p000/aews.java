package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.updateshares.UpdateSharesChimeraActivity;

/* renamed from: aews */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aews implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ UpdateSharesChimeraActivity f63957a;

    public aews(UpdateSharesChimeraActivity updateSharesChimeraActivity) {
        this.f63957a = updateSharesChimeraActivity;
    }

    public void onClick(View view) {
        this.f63957a.f79755f.mo34553b(9);
        ((ClipboardManager) this.f63957a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(this.f63957a.getString(C0126R.string.location_sharing_link_to_share), this.f63957a.f79751b.mo43758e()));
        Toast.makeText(this.f63957a, (int) C0126R.string.location_sharing_link_copied, 0).show();
        this.f63957a.finish();
    }
}
