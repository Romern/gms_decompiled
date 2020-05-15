package p000;

import com.google.android.libraries.material.progress.MaterialProgressBar;

/* renamed from: azzh */
public final /* synthetic */ class azzh implements Runnable {

    /* renamed from: a */
    private final MaterialProgressBar f100317a;

    public azzh(MaterialProgressBar materialProgressBar) {
        this.f100317a = materialProgressBar;
    }

    public final void run() {
        MaterialProgressBar materialProgressBar = this.f100317a;
        if (materialProgressBar.getVisibility() == 0) {
            materialProgressBar.setVisibility(4);
        }
    }
}
