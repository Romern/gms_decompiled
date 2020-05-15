package p000;

/* renamed from: agsh */
final /* synthetic */ class agsh implements Runnable {

    /* renamed from: a */
    private final agsl f66355a;

    public agsh(agsl agsl) {
        this.f66355a = agsl;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, java.lang.String, boolean]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    public final void run() {
        agsl agsl = this.f66355a;
        boolean c = agsl.m55047c();
        agsl.f66361a.mo26019b(agyt.m55307c()).mo68431a("%s: newActiveDataSim: needCpid ? %s", (Object) "BgTaskManager", c);
        if (c) {
            int c2 = agrl.m54949c();
            agsl.mo36054a(bxzv.TASK_HTTP_CPID_FETCH, bxzu.EVENT_NEW_SIM_ACTIVE, c2);
            if (!agsl.mo36059c(c2)) {
                agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: newActiveDataSim: fail to run CpidRefresh", "BgTaskManager");
            } else {
                agsl.mo36060d(c2);
            }
        }
    }
}
