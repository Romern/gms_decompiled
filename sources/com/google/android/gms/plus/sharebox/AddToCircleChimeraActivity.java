package com.google.android.gms.plus.sharebox;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.people.data.Audience;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddToCircleChimeraActivity extends ListActivity implements View.OnClickListener {

    /* renamed from: d */
    public static final /* synthetic */ int f83427d = 0;

    /* renamed from: a */
    public rkb f83428a;

    /* renamed from: b */
    public final ryw f83429b = new ryw(2097152);

    /* renamed from: c */
    public AddToCircleData f83430c;

    /* renamed from: a */
    private final void m69340a(String str) {
        Log.w("ShareBox", str);
        setResult(0);
        finish();
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.done_button) {
            AddToCircleData addToCircleData = this.f83430c;
            addToCircleData.mo46771a(addToCircleData.f83435e, null);
            Intent intent = new Intent();
            intent.putExtra("add_to_circle_data", this.f83430c);
            setResult(-1, intent);
            finish();
            return;
        }
        Object tag = view.getTag();
        if (tag != null && (tag instanceof aoku)) {
            ((aoku) tag).f78368e.toggle();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f83430c = (AddToCircleData) getIntent().getParcelableExtra("add_to_circle_data");
        } else {
            this.f83430c = (AddToCircleData) bundle.getParcelable("add_to_circle_data");
        }
        AddToCircleData addToCircleData = this.f83430c;
        if (addToCircleData != null) {
            Audience audience = addToCircleData.f83435e;
            if (audience == null || audience.f30287b.isEmpty()) {
                m69340a("No un-circled audience members specified");
                return;
            }
            String stringExtra = getIntent().getStringExtra("calling_package_name");
            int intExtra = getIntent().getIntExtra("client_application_id", 0);
            rjy rjy = new rjy(this);
            rjy.f43173b = stringExtra;
            rjo rjo = allr.f73629a;
            allp a = allq.m61232a();
            a.f73626a = intExtra;
            rjy.mo24780a(rjo, a.mo40491a());
            this.f83428a = rjy.mo24784b();
            setTitle((int) C0126R.string.plus_sharebox_circles_title);
            setContentView((int) C0126R.C0128layout.plus_add_to_circle_list_activity);
            getListView().setClickable(true);
            ((Button) findViewById(C0126R.C0129id.done_button)).setOnClickListener(this);
            setListAdapter(new aokr(this));
            return;
        }
        m69340a("Add to circle data not specified");
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f83429b.mo15548a();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("add_to_circle_data", this.f83430c);
    }

    public final void onStart() {
        super.onStart();
        rkb rkb = this.f83428a;
        if (rkb != null && !rkb.mo24805i() && !this.f83428a.mo24806j()) {
            this.f83428a.mo24801e();
        }
    }

    public final void onStop() {
        super.onStop();
        rkb rkb = this.f83428a;
        if (rkb == null) {
            return;
        }
        if (rkb.mo24805i() || this.f83428a.mo24806j()) {
            this.f83428a.mo24803g();
        }
    }
}
