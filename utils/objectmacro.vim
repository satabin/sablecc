syn region objectmacroComment start="\$comment\$" end="\$end\$"
syn match objectmacroDirective "\$\w\+: .* \$"
syn match objectmacroInlineComment "\$comment: .* \$"

hi link objectmacroInlineComment Comment
hi link objectmacroComment Comment
hi link objectmacroDirective Preproc
