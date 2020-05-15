package p000;

import android.content.DialogInterface;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: azjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azjv implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ Window f99536a;

    /* renamed from: b */
    final /* synthetic */ TextView f99537b;

    /* renamed from: c */
    final /* synthetic */ azjx f99538c;

    public azjv(azjx azjx, Window window, TextView textView) {
        this.f99538c = azjx;
        this.f99536a = window;
        this.f99537b = textView;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Activity activity = this.f99538c.getActivity();
        if (activity != null) {
            this.f99536a.setLayout(-1, -2);
            AccessibilityManager accessibilityManager = (AccessibilityManager) activity.getApplicationContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                obtain.getText().add(this.f99537b.getText());
                obtain.setEnabled(true);
                obtain.setClassName(getClass().getName());
                obtain.setPackageName(activity.getPackageName());
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }
}
