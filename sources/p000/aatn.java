package p000;

import android.view.View;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.googlehelp.contact.ContactOptionsContainer;

/* renamed from: aatn */
public final /* synthetic */ class aatn implements View.OnClickListener {

    /* renamed from: a */
    private final ContactOptionsContainer f56562a;

    public aatn(ContactOptionsContainer contactOptionsContainer) {
        this.f56562a = contactOptionsContainer;
    }

    public void onClick(View view) {
        ContactOptionsContainer contactOptionsContainer = this.f56562a;
        FragmentManager supportFragmentManager = contactOptionsContainer.f78856e.getSupportFragmentManager();
        new aauz().show(supportFragmentManager, ContactOptionsContainer.f78852a);
        supportFragmentManager.executePendingTransactions();
        abcx.m47501b(contactOptionsContainer.f78856e);
    }
}
