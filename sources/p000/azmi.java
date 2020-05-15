package p000;

/* renamed from: azmi */
final /* synthetic */ class azmi implements Runnable {

    /* renamed from: a */
    private final azmx f99642a;

    /* renamed from: b */
    private final String[] f99643b;

    public azmi(azmx azmx, String[] strArr) {
        this.f99642a = azmx;
        this.f99643b = strArr;
    }

    public final void run() {
        Object obj;
        azmx azmx = this.f99642a;
        String[] strArr = this.f99643b;
        if (azmx.f99678l != null) {
            for (String str : strArr) {
                if (cfgs.m139383C()) {
                    obj = new azuf(azmx.getActivity(), str, new azqr(azmx.getActivity(), azmx.f99678l), azmx, azmx);
                } else {
                    obj = new azug(str, new azqr(azmx.getActivity(), azmx.f99678l));
                }
                azmx.f99674h.put(str, obj);
                azmx.f99667a.addJavascriptInterface(obj, str);
                new Object[1][0] = str;
            }
            azph.m85998a(azmx.getActivity()).mo55125a(1915);
            azmx.mo55072a(azmx.getActivity(), azmx.getActivity().getIntent());
            return;
        }
        azoj.m85933c("WebAppFragment", "Could not add IPC JSBridge due to null bound service", new Object[0]);
        azph.m85998a(azmx.getActivity()).mo55126a(1916, 65);
    }
}
