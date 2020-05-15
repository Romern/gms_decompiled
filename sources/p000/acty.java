package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/* renamed from: acty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acty implements View.OnClickListener {

    /* renamed from: a */
    public acut f60782a;

    /* renamed from: b */
    private final Context f60783b;

    public acty(Context context) {
        this.f60783b = context;
    }

    public void onClick(View view) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
        intent.putExtra("query", this.f60782a.f60839a);
        Bundle bundle = new Bundle();
        if ("Person".equals(this.f60782a.f60845g)) {
            bundle.putString("package_name", "com.google.android.gms");
            bundle.putString("corpus", "contacts_contact_id");
        } else {
            intent.putExtra("ipa_package_name", this.f60782a.f60843e);
            bundle.putString("package_name", this.f60782a.f60843e);
            bundle.putString("corpus", this.f60782a.f60844f);
        }
        intent.putExtra("phone_search_param_bundle", bundle);
        intent.putExtra("search_within_corpus", "phone");
        intent.setFlags(268435456);
        try {
            this.f60783b.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            absg.m48205e("com.google.android.googlequicksearchbox.GOOGLE_SEARCH can not be found to execute the search Intent");
            Toast.makeText(this.f60783b, "com.google.android.googlequicksearchbox.GOOGLE_SEARCH can not be found to execute the search Intent", 1).show();
        }
    }
}
