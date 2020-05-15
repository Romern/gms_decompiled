package p000;

/* renamed from: dhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dhd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ dhm f13096a;

    public dhd(dhm dhm) {
        this.f13096a = dhm;
    }

    public final void run() {
        while (true) {
            dhe dhe = (dhe) this.f13096a.f13146i.poll();
            if (dhe != null) {
                Thread currentThread = Thread.currentThread();
                String name = getClass().getName();
                String name2 = dhe.f13098b.getClass().getName();
                String action = dhe.f13097a.getAction();
                int length = String.valueOf(name).length();
                StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(name2).length() + String.valueOf(action).length());
                sb.append("[");
                sb.append(name);
                sb.append("] processing ");
                sb.append(name2);
                sb.append(" for action ");
                sb.append(action);
                currentThread.setName(sb.toString());
                dhe.run();
            } else {
                Thread.currentThread().setName(this.f13096a.f13139b);
                return;
            }
        }
    }
}
