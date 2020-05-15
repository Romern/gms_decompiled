package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: txr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum txr {
    NULL("null", new tyo()),
    SET_APP_AUTH_STATE("setAuthState", new tyw()),
    METADATA("metadata", new tym()),
    UNDO_METADATA("undoMetadata", new tzm()),
    CONTENT_AND_METADATA("contentAndMetadata", new tya()),
    UNDO_CONTENT_AND_METADATA("undoContentAndMetadata", new tzg()),
    CREATE_FILE("createFile", new tyc()),
    CREATE_SHORTCUT_FILE("createShortcutFile", new tyg()),
    CREATE_FOLDER("createFolder", new tye()),
    UNDO_CREATE_ENTRY("undoCreateEntry", new tzi()),
    TRASH("trash", new tze()),
    UNDO_TRASH("undoTrash", new tzq()),
    DELETE_FILE("deleteFile", new tyj()),
    UNDO_DELETE_FILE("undoDeleteFile", new tzk()),
    SET_RESOURCE_PARENTS("setResourceParents", new tyy()),
    CHANGE_RESOURCE_PARENTS("changeResourceParents", new txy()),
    SET_SUBSCRIBED("setSubscribed", new tzb()),
    ADD_PERMISSION("addPermission", new txs()),
    UPDATE_PERMISSION("updatePermission", new tzs()),
    REMOVE_PERMISSION("removePermission", new tys()),
    UNDO_PERMISSION("undoPermission", new tzo()),
    UNDO_CREATE_FILE("undoCreateFile", new tzi()),
    UNDO_CREATE_SHORTCUT_FILE("undoCreateShortcutFile", new tzi()),
    UNDO_CREATE_FOLDER("undoCreateFolder", new tzi());
    

    /* renamed from: A */
    private static final Map f46924A = new HashMap();

    /* renamed from: y */
    public final String f46950y;

    /* renamed from: z */
    public final txo f46951z;

    static {
        txr[] values = values();
        for (txr txr : values) {
            f46924A.put(txr.f46950y, txr);
        }
    }

    private txr(String str, txo txo) {
        this.f46950y = str;
        this.f46951z = txo;
    }

    /* renamed from: a */
    public static txr m37691a(String str) {
        return (txr) f46924A.get(str);
    }
}
