package com.google.android.gms.people.profile;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.OutputStream;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AvatarPreviewChimeraActivity extends FragmentActivity implements View.OnClickListener {

    /* renamed from: a */
    private Uri f81962a;

    /* renamed from: b */
    private AvatarView f81963b;

    /* renamed from: a */
    private final void m68084a() {
        Toast.makeText(this, (int) C0126R.string.people_avatar_error, 0).show();
        setResult(1);
        finish();
    }

    public void onClick(View view) {
        OutputStream outputStream;
        int id = view.getId();
        if (id == C0126R.C0129id.cancel_button) {
            setResult(0);
            finish();
        } else if (id == C0126R.C0129id.accept_button) {
            Uri a = amio.m62946a(this, "cropped-avatar.jpg");
            if (a == null) {
                Log.w("People.Avatar", "Failed to get temp file to crop photo");
                m68084a();
                return;
            }
            try {
                AvatarView avatarView = this.f81963b;
                float f = 256.0f / ((float) (avatarView.f81980d.right - avatarView.f81980d.left));
                int i = -avatarView.f81980d.left;
                int i2 = -avatarView.f81980d.top;
                Bitmap createBitmap = Bitmap.createBitmap(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(avatarView.getResources().getColor(C0126R.color.people_avatar_preview_background));
                Matrix matrix = new Matrix(avatarView.f81978b);
                if (i + i2 != 0) {
                    matrix.postTranslate((float) i, (float) i2);
                }
                if (f + f != 0.0f) {
                    matrix.postScale(f, f);
                }
                canvas.concat(matrix);
                avatarView.f81977a.draw(canvas);
                try {
                    outputStream = avatarView.getContext().getContentResolver().openOutputStream(a);
                    try {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, (int) cgbe.m144181j(), outputStream);
                        srz.m36171a(outputStream);
                        Intent intent = new Intent();
                        intent.putExtra("com.google.android.gms.people.profile.EXTRA_URI", a);
                        setResult(-1, intent);
                        finish();
                    } catch (Throwable th) {
                        th = th;
                        srz.m36171a(outputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    srz.m36171a(outputStream);
                    throw th;
                }
            } catch (Exception e) {
                Log.e("People.Avatar", "Failed to write cropped photo", e);
                m68084a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        if (r3 != ((android.graphics.drawable.BitmapDrawable) r2).getBitmap()) goto L_0x0061;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (bundle == null) {
            this.f81962a = (Uri) getIntent().getExtras().getParcelable("com.google.android.gms.people.profile.EXTRA_URI");
        } else {
            this.f81962a = (Uri) bundle.getParcelable("photo_uri");
        }
        setContentView((int) C0126R.C0128layout.avatar_preview_activity);
        AvatarView avatarView = (AvatarView) findViewById(C0126R.C0129id.avatar_view);
        this.f81963b = avatarView;
        try {
            Uri uri = this.f81962a;
            avatarView.mo46373a();
            int k = (int) cgbe.m144182k();
            Bitmap a = ssa.m36184a(avatarView.getContext(), uri, k, k, true);
            if (a != null) {
                Drawable drawable = avatarView.f81977a;
                if (drawable != null) {
                    drawable.setCallback(null);
                    Drawable drawable2 = avatarView.f81977a;
                    if (!(drawable2 instanceof BitmapDrawable)) {
                    }
                    z = avatarView.f81977a.getIntrinsicWidth() == a.getWidth() ? avatarView.f81977a.getIntrinsicHeight() != a.getHeight() : true;
                    avatarView.f81989m = 0.0f;
                    avatarView.mo46373a();
                } else {
                    z = false;
                }
                if (avatarView.f81977a == null) {
                    avatarView.f81977a = new BitmapDrawable(avatarView.getResources(), a);
                    avatarView.f81977a.setCallback(avatarView);
                }
                avatarView.mo46375a(z);
                avatarView.invalidate();
                avatarView.requestLayout();
                avatarView.invalidate();
                this.f81963b.f81985i = true;
                findViewById(C0126R.C0129id.cancel_button).setOnClickListener(this);
                findViewById(C0126R.C0129id.accept_button).setOnClickListener(this);
                return;
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("No bitmap loaded from ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        } catch (RuntimeException e) {
            amdk.m62658a("People.Avatar", "Failed to initialize AvatarView: %s", e.getMessage());
            m68084a();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("photo_uri", this.f81962a);
    }
}
