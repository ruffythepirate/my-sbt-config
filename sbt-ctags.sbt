import net.ceedubs.sbtctags.CtagsKeys

CtagsKeys.ctagsParams ~= (_.copy(executable="/usr/local/bin/ctags", languages = Seq("scala")))

